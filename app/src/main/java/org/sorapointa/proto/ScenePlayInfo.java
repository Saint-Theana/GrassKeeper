package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ScenePlayInfo {
    @Tag(tag=15) public Integer entryId = null;
    @Tag(tag=11) public Integer playId = null;
    @Tag(tag=3) public Integer playType = null;
    @Tag(tag=9) public Boolean isOpen = null;
}
