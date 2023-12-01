import Data.List (groupBy)

format :: String -> [String]
format inp = lines inp


main :: IO ()
main = do
  sample <- readFile "sample.txt"
  putStrLn sample
