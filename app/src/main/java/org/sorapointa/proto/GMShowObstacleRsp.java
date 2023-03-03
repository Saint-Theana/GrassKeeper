package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GMObstacleInfo.*;
import org.sorapointa.proto.GMObstacleInfo;

public class GMShowObstacleRsp {
    @Tag(tag=5,isSigned=true) public Integer retcode = null;
    @Tag(tag=6) public List<GMObstacleInfo> obstacles = new ArrayList<>();
}
