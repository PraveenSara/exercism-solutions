codes = {
    "black": 0,
    "brown": 1,
    "red": 2,
    "orange": 3,
    "yellow": 4,
    "green": 5,
    "blue": 6,
    "violet": 7,
    "grey": 8,
    "white": 9,
}

tolerance = {
    "grey": "±0.05%",
    "violet": "±0.1%",
    "blue": "±0.25%",
    "green": "±0.5%",
    "brown": "±1%",
    "red": "±2%",
    "gold": "±5%",
    "silver": "±10%",
}


def format_value(value):
    units = [
        (1_000_000_000, "gigaohms"),
        (1_000_000, "megaohms"),
        (1_000, "kiloohms"),
        (1, "ohms"),
    ]

    for factor, unit in units:
        if value >= factor:
            scaled = value / factor

            if scaled.is_integer():
                scaled = int(scaled)

            return f"{scaled} {unit}"

    return "0 ohms"


def resistor_label(colors):
    if colors == ["black"]:
        return "0 ohms"

    if len(colors) == 4:
        value = (
            (10 * codes[colors[0]] + codes[colors[1]])
            * (10 ** codes[colors[2]])
        )
        return f"{format_value(value)} {tolerance[colors[3]]}"

    if len(colors) == 5:
        value = (
            (100 * codes[colors[0]]
             + 10 * codes[colors[1]]
             + codes[colors[2]])
            * (10 ** codes[colors[3]])
        )
        return f"{format_value(value)} {tolerance[colors[4]]}"