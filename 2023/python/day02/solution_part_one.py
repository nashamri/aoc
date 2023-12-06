original_limits = { "red": 12, "green": 13, "blue": 14 }

def is_set_possible(throw, limits):
    number, color = int(throw[0]), throw[1]
    return color in limits and number <= limits[color]

possible_games = []

with open("part_one/input.txt", "r") as file:
    for line in file:
        game_id, data = line.split(":")
        sets = data.replace(";", ",").split(",")
        if all(is_set_possible(set_.strip().split(), original_limits) for set_ in sets):
            possible_games.append(int(game_id.split()[1]))

print("Sum of possible game IDs:", sum(possible_games))