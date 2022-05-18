function validateForm(event) {
    console.log(event)
    event.preventDefault()

    alert('Submit Button Works')

    var name = document.getElementById('uname');
    if (name.value == '') {
        alert("Name Should not be empty")
        name.focus();
        return false;
    }

    var radioGender = document.getElementsByName('gender');
    console.log(radioGender)
    var flag = ''
    for (let index = 0; index < radioGender.length; index++) {
        if (radioGender[index].checked) {
            flag = radioGender[index].value
        }

    }
    if (flag == '') {
        alert("Select the Gender")

        return false
    }
    alert('Form Submitted')
    return true;

}