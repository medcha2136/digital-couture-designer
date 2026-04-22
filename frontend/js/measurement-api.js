export async function getMeasurements(userId) {
  const response = await fetch(`http://localhost:8080/api/measurement/${userId}`);
  return await response.json();
}

export async function saveMeasurement(data) {
  return fetch("http://localhost:8080/api/measurement", {
    method: "POST",
    headers: {
      "Content-Type": "application/json"
    },
    body: JSON.stringify(data)
  });
}