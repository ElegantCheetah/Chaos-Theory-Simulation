#* Zain Kergaye
# 
#TODO: Basics for a double pendulum:
# ! Have two points at a fixed distance away from each other and from the origin
# ! Have gravity pull them down, they will act as two objects but can be moved by the other
# ! Make it look cool
# ! Add comments

import pygame, sys

pygame.init() #Initializing pygame intstance

size = width, height = 500, 500 #Size of window
speed = [1,1] #Speed of game
black = 0, 0, 0 #RGB value of black

screen = pygame.display.set_mode(size) #Setting a screen size to the instance of pygame

#pendulumP1 = pygame.draw_point
#pendulumP2 = pygame.draw_point
#pendulumP1Rect = pendulumP1.get_rect()
#pendulumP2Rect = pendulumP2.get_rect()

while 1:
    screen.fill(black)
    pygame.display.flip()