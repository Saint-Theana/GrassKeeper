package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGReplayOperationData {
    @Tag(tag=15) public GCGOperation op = null;
    @Tag(tag=10) public Integer controllerId = null;
}
