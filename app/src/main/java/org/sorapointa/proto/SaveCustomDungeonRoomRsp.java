package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CustomDungeonBlock.*;
import org.sorapointa.proto.CustomDungeonBlock;

public class SaveCustomDungeonRoomRsp {
    @Tag(tag=14) public Integer roomId = null;
    @Tag(tag=9) public List<CustomDungeonBlock> errorBlockList = new ArrayList<>();
    @Tag(tag=12,isSigned=true) public Integer retcode = null;
}
