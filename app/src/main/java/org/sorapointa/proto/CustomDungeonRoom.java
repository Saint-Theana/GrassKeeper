package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CustomDungeonBlock.*;
import org.sorapointa.proto.CustomDungeonBlock;

public class CustomDungeonRoom {
    @Tag(tag=15) public Integer roomId = null;
    @Tag(tag=4) public List<CustomDungeonBlock> blockList = new ArrayList<>();
}
