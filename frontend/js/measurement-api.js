import { getMeasurements, saveMeasurement } from "../js/measurement-api.js";

export async function getMeasurements(userId) {
  const data = await getMeasurements(userId);
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