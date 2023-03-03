package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ScenePlayInfo.*;
import org.sorapointa.proto.ScenePlayInfo;

public class ScenePlayInfoListNotify {
    @Tag(tag=6) public List<ScenePlayInfo> playInfoList = new ArrayList<>();
}
