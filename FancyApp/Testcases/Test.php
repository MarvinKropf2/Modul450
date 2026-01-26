<?php

use PHPUnit\Framework\TestCase;

require_once __DIR__ . '/../Application/MyFancyClass.php';

class Test extends TestCase
{

    private $fancy;

    protected function setUp(): void
    {
        $this->fancy = new MyFancyClass();
    }

    public function testShortString()
    {
        // Test with a short string (<= 5 chars) -> expect string back
        $this->assertEquals("Hi", $this->fancy->shortString("Hi"));
        $this->assertEquals("12345", $this->fancy->shortString("12345"));

        // Test with a long string (> 5 chars) -> expect null
        // "Ich bin Text mit 35 Char Länge (35)" is definitely > 5
        $this->assertNull($this->fancy->shortString("Ich bin Text mit 35 Char Länge (35)"));
    }

    public function testCalcAverage()
    {
        // Test average calculation
        $this->assertEquals(2, $this->fancy->calcAverage([1, 2, 3]));
        $this->assertEquals(5, $this->fancy->calcAverage([5, 5, 5]));
        $this->assertEquals(4.5, $this->fancy->calcAverage([4, 5]));
    }

    public function testGetOpposite()
    {
        // Test boolean negation
        $this->assertTrue($this->fancy->getOpposite(false));
        $this->assertFalse($this->fancy->getOpposite(true));
    }
}
