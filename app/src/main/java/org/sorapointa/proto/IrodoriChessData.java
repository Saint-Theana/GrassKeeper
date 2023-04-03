package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.IrodoriChessLevelData.*;
import org.sorapointa.proto.IrodoriChessLevelData;

public class IrodoriChessData {
    @Tag(tag=9) public List<IrodoriChessLevelData> levelDataList = new ArrayList<>();
    @Tag(tag=7) public Boolean isOpen = null;
}
