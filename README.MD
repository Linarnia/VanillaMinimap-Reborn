## Vanilla Minimaps

-----
В планах на переработку.

**Supported server version: 1.21**

### Features

- Clientside layer entities
- Smooth clientside rotation
- Real-time world rendering
- Position interpolation
- Better map colors
- Configurable markers
- Fullscreen map view
- Configurable blockstate colors

### Mods compatibility

- [x] Sodium (without shaders)
- [x] OptiFine (without shaders)
- [ ] Iris/OptiFine shader packs
- [ ] MoreCulling
- [ ] ImmediatelyFast

### Common problems

**The plugin isn't working!!!!!! I get two maps, one above my chest and the other one above my head.**
> This means that the resource pack is not installed properly, or you have iris/optifine shaders enabled. 
> If you are using plugins like ItemsAdder, they may overwrite shaders in the resource pack, 
> ask the dev of the plugin you are using to manage the resource pack.

**This doesn't work with optifine/iris shaderpacks.**
> Optifine/Iris override vanilla shaders. This can't be fixed.

**This doesn't work on Bedrock with Geyser.**
> The plugin uses vanilla shaders to display the minimap, this is an exclusive feature for the Java Edition. 
> Bedrock will never be supported by this plugin.

**The minimap is not displayed correctly with mod <...>**
> There are some mods that break the minimap, compatibility with some of them can be fixed and with some not. 
> Check [Mods compatibility](https://github.com/JNNGL/VanillaMinimaps?tab=readme-ov-file#mods-compatibility) 
> and [Issues](https://github.com/JNNGL/VanillaMinimaps/issues). If you haven't found any information for a mod 
> that breaks the minimap, feel free to open an issue.

### Credits

- **Godlander's map colors**: [*Link*](https://github.com/Godlander/vpp/blob/main/assets/minecraft/shaders/core/render/text.fsh) (Used in this plugin to significantly improve the look of minimaps by tweaking map colors)
