package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.IrodoriChessLevelData.*;
import org.sorapointa.proto.IrodoriChessLevelData;

public class IrodoriChessData {
    @Tag(tag=8) public Boolean isOpen = null;
    @Tag(tag=1) public List<IrodoriChessLevelData> levelDataList = new ArrayList<>();
}
