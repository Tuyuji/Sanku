rootProject.name = "Sanku"

includeBuild("../Mirhi")
/*
include("Rhino")
include("Rhino:Vulkan")
project(":Rhino:Vulkan").projectDir = file("Rhino/Vulkan")
include("Rhino:AWT")
project(":Rhino:AWT").projectDir = file("Rhino/AWT")
*/

/*
include("Engine:Core")
project(":Engine:Core").projectDir = file("Engine/Core")
include("Engine:PlatformSDL")
project(":Engine:PlatformSDL").projectDir = file("Engine/PlatformSDL")
include("Engine:AssetProcessor")
project(":Engine:AssetProcessor").projectDir = file("Engine/AssetProcessor")
include("Engine:Runtime")
project(":Engine:Runtime").projectDir = file("Engine/Runtime")
include("Engine:Editor")
project(":Engine:Editor").projectDir = file("Engine/Editor")
include("Engine:GameLauncher")
project(":Engine:GameLauncher").projectDir = file("Engine/GameLauncher")

fun isRealModuleDir(dir: java.io.File) = dir.isDirectory && dir.name != "build" && !dir.name.startsWith(".")

file("Plugins").listFiles()?.filter(::isRealModuleDir)?.forEach { dir ->
    include("Plugins:${dir.name}")
    project(":Plugins:${dir.name}").projectDir = dir
}
file("Games").listFiles()?.filter(::isRealModuleDir)?.forEach { dir ->
    include("Games:${dir.name}")
    project(":Games:${dir.name}").projectDir = dir
}*/
