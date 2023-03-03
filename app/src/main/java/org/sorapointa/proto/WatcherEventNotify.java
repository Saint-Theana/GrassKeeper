package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class WatcherEventNotify {
    @Tag(tag=6) public Integer addProgress = null;
    @Tag(tag=9) public Integer watcherId = null;
}
