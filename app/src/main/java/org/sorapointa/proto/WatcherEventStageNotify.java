package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class WatcherEventStageNotify {
    @Tag(tag=4) public Integer addProgress = null;
    @Tag(tag=2) public Integer stage = null;
    @Tag(tag=12) public Integer watcherId = null;
}
