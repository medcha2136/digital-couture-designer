export function renderMeasurements(listEl, data) {
  listEl.innerHTML = "";

  data.forEach((m, index) => {
    listEl.innerHTML += `
      <div style="background:white; padding:15px; margin:10px; border-radius:10px;">
        <b>${index === 0 ? "⭐ Latest" : "📜 Previous"}</b><br>
        Date: ${m.createdAt}<br>
        Waist: ${m.waistUpper}
      </div>
    `;
  });
}