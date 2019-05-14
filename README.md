# Encrypt and Decrypt Word API

First attempt at using some aspects of the spring framework to create a basic encryption and decryption API.

The user can encrypt a word/message by entering a query containing the word/message along with their own key. To decrypt the word/message at a later time the encrypted message along with the key will result in the message being revealed. As long as you have your key you can decrypt all your words/messages.

String ---> Cipher ---> Base64 encode ---> Returned Encrypted String

Encrypted String ---> Base64 decode ---> Cipher ---> Returned Original String

A lot to learn, used some aspects of the spring framework for the first time. It Uses a familiar setup to most APIs and found it easy to return the information needed from the two classes for encrypting and decrypting. The cipher uses AES (Advanced Encryption Standard) although there were other options. Getting the flow right when encrypting and decrypting was another challenge, knowing what form the word data was in so as to correctly pass it on to next method. Had to look over a few docs, articles and stackoverflow for this one :)

## Installation

```
git clone git@github.com:LondonJim/Word-Encrypt-Decrypt-API.git
```

## Instructions
#### Build .jar file

```
gradle build
```

#### Execute
```
java -jar ./build/libs/WordCrypt-0.1.0.jar
```

## Tests
`JUnit 4.12`

```
gradle test
```

## Instructions

Execute `java -jar ./build/libs/WordCrypt-0.1.0.jar` and navigate to `localhost:8080`

Note: using the AES cipher requires the key you enter to be multiples of 16 bytes, so entering characters for the key in the query requires it to be 16 (32 etc) in length.

### Encrypt

Example
```
localhost:8080/encrypt?wordToEncrypt=Test&key=1234567890abcdef
```

The word to encrypt is test and the made up key needed to decrypt is 1234567890abcdef.

Returns
```
{"encryptedWord":"klkwl4KGEJyQdKxbSdrFsQ=="}

```

### Decrypt

Example
```
localhost:8080/decrypt?wordToDecrypt=klkwl4KGEJyQdKxbSdrFsQ==&key=1234567890abcdef
```

The word to decrypt is klkwl4KGEJyQdKxbSdrFsQ and the made up key needed to decrypt is 1234567890abcdef.

Returns
```
{"decryptedWord":"test"}

```
