document.addEventListener("DOMContentLoaded", function() {
    const API_BASE_URL = "http://localhost:8080";

    document.querySelector("#upload button").addEventListener("click", function() {
        let fileInput = document.getElementById("fileUpload");
        if (fileInput.files.length > 0) {
            let formData = new FormData();
            formData.append("file", fileInput.files[0]);

            fetch(`${API_BASE_URL}/upload`, {
                method: "POST",
                body: formData
            })
            .then(response => response.json())
            .then(data => Swal.fire("Éxito", "Archivo subido correctamente: " + data.fileName, "success"))
            .catch(error => Swal.fire("Error", "Error al subir el archivo: " + error.message, "error"));
        } else {
            Swal.fire("Error", "Por favor selecciona un archivo para subir.", "error");
        }
    });

    document.querySelector("#report button").addEventListener("click", function() {
        let fileName = document.getElementById("fileName").value;
        let filePath = document.getElementById("filePath").value;

        if (fileName && filePath) {
            fetch(`${API_BASE_URL}/generateReport`, {
                method: "POST",
                headers: { "Content-Type": "application/json" },
                body: JSON.stringify({ fileName, filePath })
            })
            .then(response => response.json())
            .then(data => Swal.fire("Éxito", "Informe generado correctamente en: " + data.filePath, "success"))
            .catch(error => Swal.fire("Error", "Error al generar el informe: " + error.message, "error"));
        } else {
            Swal.fire("Error", "Por favor ingresa el nombre del archivo y la ruta de guardado.", "error");
        }
    });

    document.querySelector("#employee button").addEventListener("click", function() {
        let employeeId = document.getElementById("employeeId").value;

        if (employeeId) {
            fetch(`${API_BASE_URL}/payroll/${employeeId}`, { method: "GET" })
            .then(response => {
                if (!response.ok) {
                    throw new Error("Empleado no encontrado.");
                }
                return response.json();
            })
            .then(data => {
                Swal.fire({
                    icon: "info",
                    title: "Nómina Consultada",
                    html: `<pre>${JSON.stringify(data, null, 2)}</pre>`,
                    confirmButtonColor: "#3085d6"
                });
            })
            .catch(error => Swal.fire("Error", "Error al consultar la nómina: " + error.message, "error"));
        } else {
            Swal.fire("Error", "Por favor ingresa un ID de empleado.", "error");
        }
    });

    document.querySelector("#contract form").addEventListener("submit", function(event) {
        event.preventDefault(); // Evita que la página se recargue
        let formData = new FormData(event.target);

        let contractData = {};
        formData.forEach((value, key) => {
            contractData[key] = value;
        });

        fetch(`${API_BASE_URL}/contract`, {
            method: "POST",
            headers: { "Content-Type": "application/json" },
            body: JSON.stringify(contractData)
        })
        .then(response => {
            if (!response.ok) {
                throw new Error("No se pudo crear el contrato.");
            }
            return response.json();
        })
        .then(data => Swal.fire("Éxito", "Contrato creado correctamente para: " + data.fullName, "success"))
        .catch(error => Swal.fire("Error", "Error al crear el contrato: " + error.message, "error"));
    });
});
