package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ScenePlayInfo {
    @Tag(tag=1) public Integer entryId = null;
    @Tag(tag=8) public Integer playId = null;
    @Tag(tag=2) public Boolean isOpen = null;
    @Tag(tag=12) public Integer playType = null;
}
