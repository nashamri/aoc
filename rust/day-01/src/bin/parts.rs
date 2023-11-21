use day_01::{process_part1, process_part2};
use std::fs::*;

fn main() {
    match read_to_string("./input.txt") {
        Ok(content) => println!("Part 1:{}", process_part1(&content)),
        Err(error) => println!("{}", error),
    }

    let file = read_to_string("./input.txt").unwrap();
    println!("Part 2: {}", process_part2(&file))
}
