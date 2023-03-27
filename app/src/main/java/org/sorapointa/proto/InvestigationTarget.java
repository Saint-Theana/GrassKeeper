package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class InvestigationTarget {
    @Tag(tag=13) public Integer investigationId = null;
    @Tag(tag=7) public Integer state = null;
    @Tag(tag=1) public Integer totalProgress = null;
    @Tag(tag=3) public Integer questId = null;
    @Tag(tag=15) public Integer progress = null;
}
