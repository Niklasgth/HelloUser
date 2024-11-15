document.getElementById('loginForm').addEventListener('submit', function(event) {
    event.preventDefault();  // Enligt sida jag hittade så ska denna koden stoppa att formuläret skickas direkt.

    var adminName = document.getElementById('adminName').value;
    var password = document.getElementById('password').value;

    //Lösenorden här istället för min loginklass som innan
    var rightAdminName = 'admin';
    var rightPassword = 'admin';

    //Nu en if sats för kolla om både adminName och password är korrekta
    if (adminName === rightAdminName && password === rightPassword) {
        localStorage.setItem('isAdminLoggedIn', 'true');
        localStorage.getItem('isAdminLoggedIn');

        // weird länkning som jag lyckats googla min fram till och jag fick den att fungera. 
        //inte riktigt säker på hur den fungerar men den skickar mig tilll rätt windows. 
        window.location.href = '/adminstart';

    } else {
        // Testade att lägga till en felmeddelande kod jag hittade. Tyckte det blev bra i sidan. 
        document.getElementById('error-message').innerText = 'Fel användarnamn eller lösenord';
    }
});
