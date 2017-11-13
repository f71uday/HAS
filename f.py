from firebase import firebase
firebase = firebase.FirebaseApplication('https://haslogin-9d6c3.firebaseio.com/', None)
result = firebase.put('','/light',5)
firebase.put('','/fan',5)
print result
