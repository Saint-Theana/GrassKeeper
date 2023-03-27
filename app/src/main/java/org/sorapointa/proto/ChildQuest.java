package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChildQuest {
    @Tag(tag=5) public Integer questId = null;
    @Tag(tag=10) public Integer questConfigId = null;
    @Tag(tag=12) public Integer state = null;
}
