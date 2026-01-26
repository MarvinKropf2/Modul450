<?php

class MyFancyClass {

    /**
     * If the string is longer than 5 characters, null should be returned.
     * Otherwise the string itself should be returned.
     *
     * @param string $input
     * @return string|null
     */
    public function shortString($input) {
        if (strlen($input) > 5) {
            return null;
        }
        return $input;
    }

    /**
     * Calculates the average of the numbers in the array.
     *
     * @param array $numbers
     * @return float
     */
    public function calcAverage($numbers) {
        if (empty($numbers)) {
            return 0;
        }
        return array_sum($numbers) / count($numbers);
    }

    /**
     * Returns the opposite boolean value.
     *
     * @param bool $input
     * @return bool
     */
    public function getOpposite($input) {
        return !$input;
    }
}
