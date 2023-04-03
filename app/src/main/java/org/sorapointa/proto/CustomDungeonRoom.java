package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CustomDungeonBlock.*;
import org.sorapointa.proto.CustomDungeonBlock;

public class CustomDungeonRoom {
    @Tag(tag=7) public List<CustomDungeonBlock> blockList = new ArrayList<>();
    @Tag(tag=3) public Integer roomId = null;
}
