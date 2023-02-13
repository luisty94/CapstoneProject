const baseURL = 'http://localhost:8080/characters/';

export const getAllCharacters = () => {
    return fetch(baseURL)
        .then(res => res.json())
}

export const postCharacter = (payload) => {
    return fetch(baseURL, {
            method: 'POST',
            body: JSON.stringify(payload),
            headers: { 'Content-Type': 'application/json' }
        })
        .then(res => res.json())
}