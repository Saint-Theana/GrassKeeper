package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.LockedPersonallineData_LockReason.*;
import org.sorapointa.proto.LockedPersonallineData_LockReason;

public class LockedPersonallineData {
    @Tag(tag=6) public Integer personalLineId = null;
    @Tag(tag=4) public Integer lockReason = null;
    @Tag(tag=5) public Integer chapterId = null;
    @Tag(tag=13) public Integer level = null;
}
