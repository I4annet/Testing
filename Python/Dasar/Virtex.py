import pyautogui
import time

virtex = "Hanya testing saja" * 10
print(virtex)

time.sleep(3)


pyautogui.typewrite(virtex)
pyautogui.press('enter')

