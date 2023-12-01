numbers = []

def keep_numbers_only(input_string):
    return ''.join(filter(str.isdigit, input_string))

with open("sample.txt","r") as file:
    for line in file:
        number = str(keep_numbers_only(line))
        first_digit = number[0]
        last_digit = number[-1]
        numbers.append(int(first_digit+last_digit))

print(sum(numbers))


  git config --global user.email "farisala@infinitepl.com"
  git config --global user.name "@Githuba93bpasswordbaltare5"