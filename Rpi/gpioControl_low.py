import RPi.GPIO as GPIO
import sys
GPIO.setmode(GPIO.BOARD)
gpio_no = int(sys.argv[1])
GPIO.setup(gpio_no,GPIO.OUT)
GPIO.output(gpio_no,GPIO.LOW)
