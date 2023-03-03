package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ExitTransPointRegionNotify {
    @Tag(tag=1) public Integer pointId = null;
    @Tag(tag=7) public Integer sceneId = null;
}
