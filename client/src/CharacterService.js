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

export const postAttack = (payload) => {
    return fetch(baseURL + "combat", {
        method: 'POST',
        body: JSON.stringify(payload),
        headers: { 'Content-Type': 'application/json' }
    })
    .then(res => res.json())
}

export const postHeal = (payload) => {
    return fetch(baseURL + "heal", {
        method: 'POST',
        body: JSON.stringify(payload),
        headers: { 'Content-Type': 'application/json' }
    })
    .then(res => res.json())
}