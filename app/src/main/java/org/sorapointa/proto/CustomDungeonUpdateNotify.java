package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CustomDungeonBrief.*;
import org.sorapointa.proto.CustomDungeonBrief;

public class CustomDungeonUpdateNotify {
    @Tag(tag=12) public CustomDungeonBrief dungeonBrief = null;
}
