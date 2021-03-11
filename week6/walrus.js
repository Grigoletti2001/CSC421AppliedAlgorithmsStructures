const values = [];

const input = 0;

input = parseInt(readline());

while (input > 0) {
    values.push(parseInt(readline()));
    input--;
}

const outcome = new Array(2001);

outcome[0] = true;

function loop() {
    for (let i = 0; i < values.length; i++) {
        let presentValue = values[i];

        let top = 20001 - presentValue;

        for (let j = top; j >= 0; j--) {
            if (outcome[j]) {
                outcome[j + presentValue] = true;
            }
        }
    }
}

loop();

for (let i = 0; i < outcome.length; i++) {
    if (outcome[10000 + i]) {
        print(10000 + i);
        break;
    } else if (outcome[10000 - i]) {
        print(10000 - i);
        break;
    }
}