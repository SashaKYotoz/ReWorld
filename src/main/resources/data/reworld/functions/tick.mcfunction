#Author Mr_Kapitoshka


#ShowArms|0
execute as @e[type=armor_stand,nbt={HandItems:[{id:"minecraft:stick"},{}]}] as @s run tag @s add noarms
execute as @e[type=armor_stand,tag=noarms,nbt={HandItems:[{id:"minecraft:stick"},{}]}] as @s run data merge entity @s {ShowArms:0b}
execute as @e[type=armor_stand,tag=noarms,nbt={HandItems:[{id:"minecraft:stick"},{}]}] as @s run data merge entity @s {HandItems:[{id:"minecraft:air"}]}


#NoBasePlate|1
execute as @e[type=armor_stand,nbt={HandItems:[{id:"minecraft:smooth_stone_slab"},{}]}] as @s run tag @s add yesbaseplate
execute as @e[type=armor_stand,tag=yesbaseplate,nbt={HandItems:[{id:"minecraft:smooth_stone_slab"},{}]}] as @s run data merge entity @s {NoBasePlate:1b}
execute as @e[type=armor_stand,tag=yesbaseplate,nbt={HandItems:[{id:"minecraft:smooth_stone_slab"},{}]}] as @s run data merge entity @s {HandItems:[{id:"minecraft:air"}]}


#Glowing|1
execute as @e[type=armor_stand,nbt={HandItems:[{id:"minecraft:glow_ink_sac"},{}]}] as @s run tag @s add yesglowing
execute as @e[type=armor_stand,tag=yesglowing,nbt={HandItems:[{id:"minecraft:glow_ink_sac"},{}]}] as @s run data merge entity @s {Glowing:1b}
execute as @e[type=armor_stand,tag=yesglowing,nbt={HandItems:[{id:"minecraft:glow_ink_sac"},{}]}] as @s run data merge entity @s {HandItems:[{id:"minecraft:air"}]}


#Small|1
execute as @e[type=armor_stand,nbt={HandItems:[{id:"minecraft:wooden_axe"},{}]}] as @s run tag @s add yessmall
execute as @e[type=armor_stand,tag=yessmall,nbt={HandItems:[{id:"minecraft:wooden_axe"},{}]}] as @s run data merge entity @s {Small:1b}
execute as @e[type=armor_stand,tag=yessmall,nbt={HandItems:[{id:"minecraft:wooden_axe"},{}]}] as @s run data merge entity @s {HandItems:[{id:"minecraft:air"}]}


#HasVisualFire|1
execute as @e[type=armor_stand,nbt={HandItems:[{id:"minecraft:fire_charge"},{}]}] as @s run tag @s add yesfire
execute as @e[type=armor_stand,tag=yesfire,nbt={HandItems:[{id:"minecraft:fire_charge"},{}]}] as @s run data merge entity @s {HasVisualFire:1b}
execute as @e[type=armor_stand,tag=yesfire,nbt={HandItems:[{id:"minecraft:fire_charge"},{}]}] as @s run data merge entity @s {HandItems:[{id:"minecraft:air"}]}


#CustomNameVisible|1
execute as @e[type=armor_stand,nbt={HandItems:[{id:"minecraft:tripwire_hook"},{}]}] as @s run tag @s add yesnamevisible
execute as @e[type=armor_stand,tag=yesnamevisible,nbt={HandItems:[{id:"minecraft:tripwire_hook"},{}]}] as @s run data merge entity @s {CustomNameVisible:1b}
execute as @e[type=armor_stand,tag=yesnamevisible,nbt={HandItems:[{id:"minecraft:tripwire_hook"},{}]}] as @s run data merge entity @s {HandItems:[{id:"minecraft:air"}]}


#Invisible|1
execute as @e[type=armor_stand,nbt={HandItems:[{id:"minecraft:structure_void"},{}]}] as @s run tag @s add yesinvisible
execute as @e[type=armor_stand,tag=yesinvisible,nbt={HandItems:[{id:"minecraft:structure_void"},{}]}] as @s run data merge entity @s {Invisible:1b}
execute as @e[type=armor_stand,tag=yesinvisible,nbt={HandItems:[{id:"minecraft:structure_void"},{}]}] as @s run data merge entity @s {HandItems:[{id:"minecraft:air"}]}