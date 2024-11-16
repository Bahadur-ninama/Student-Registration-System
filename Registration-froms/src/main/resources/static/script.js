document.getElementById("registrationForm").addEventListener("submit", function(event) {
    event.preventDefault(); // Prevent form from submitting traditionally

    const name = document.getElementById("name").value.trim();
    const email = document.getElementById("email").value.trim();
    const phone = document.getElementById("phone").value.trim();

    if (name === "" || email === "") {
        alert("Please fill in all required fields.");
        return;
    }

    // Display a success message
    document.getElementById("successMessage").innerText = "Student registered successfully!";
    document.getElementById("registrationForm").reset(); // Clear the form
});