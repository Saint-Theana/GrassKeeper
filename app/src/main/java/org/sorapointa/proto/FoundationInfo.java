package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FoundationStatus.*;
import org.sorapointa.proto.FoundationStatus;

public class FoundationInfo {
    @Tag(tag=1) public Integer status = null;
    @Tag(tag=2) public List<Integer> uidList = new ArrayList<>();
    @Tag(tag=3) public Integer currentBuildingId = null;
    @Tag(tag=4) public Integer lockedByUid = null;
}
