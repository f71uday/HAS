import RPi.GPIO as GPIO
import sys
GPIO.setmode(GPIO.BOARD)
gpio_no = sys.argv[1]
GPIO.setup(gpio_no,GPIO.OUT)
GPIO.output(gpio_no,GPIO.HIGH)
