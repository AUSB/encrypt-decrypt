# The KryptoNote App


Android Application Design Project using Android Studio


Here are a few typical use cases:

•	Launch the app; enter a note; enter a key; tap ENCRYPT; enter a filename; tap SAVE.
•	Launch the app; enter a filename; tap LOAD; enter a key; tap DECRYPT.

Requirement:
1.	The app must allow only digits for the key, only letters and digits for the filename, and only uppercase letters and spaces in the note textbox.
2.	If the Encrypt button is tapped, then the app must encrypt the entered note using the Vigenere cipher together with the entered key and display the result back in the note textbox (thus overwriting its contents).
3.	If the Decrypt button is tapped, then the app must decrypt the entered note using the Vigenere cipher together with the entered key and display the result back to the textbox (thus overwriting its contents).
4.	If the Save button is tapped, then the app must save the content of the note textbox in the indicated file and then display the toast “Note Saved” to confirm.
5.	If the Load button is tapped, then the app must load the content of the indicated file into the note textbox (thus overwriting its contents).
6.	If an exception occurred for any reason (e.g. invalid entries or file not found), the app must display a toast with an appropriate error message.
