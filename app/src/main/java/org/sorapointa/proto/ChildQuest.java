package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChildQuest {
    @Tag(tag=8) public Integer questConfigId = null;
    @Tag(tag=4) public Integer state = null;
    @Tag(tag=15) public Integer questId = null;
}
