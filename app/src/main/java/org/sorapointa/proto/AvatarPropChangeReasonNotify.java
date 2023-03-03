package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.PropChangeReason.*;
import org.sorapointa.proto.PropChangeReason;

public class AvatarPropChangeReasonNotify {
    @Tag(tag=11,isFloat=true) public Float oldValue = null;
    @Tag(tag=5) public Integer reason = null;
    @Tag(tag=1) public Integer propType = null;
    @Tag(tag=8) public Long avatarGuid = null;
    @Tag(tag=15,isFloat=true) public Float curValue = null;
}
