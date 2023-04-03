package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AbilityInvokeEntryHead.*;
import org.sorapointa.proto.AbilityInvokeEntryHead;
import org.sorapointa.proto.ForwardType.*;
import org.sorapointa.proto.ForwardType;
import org.sorapointa.proto.AbilityInvokeArgument.*;
import org.sorapointa.proto.AbilityInvokeArgument;

public class AbilityInvokeEntry {
    @Tag(tag=13) public AbilityInvokeEntryHead head = null;
    @Tag(tag=15) public Integer forwardType = null;
    @Tag(tag=12) public Integer argumentType = null;
    @Tag(tag=10) public Integer forwardPeer = null;
    @Tag(tag=4) public byte[] abilityData = null;
    @Tag(tag=8) public Integer eventId = null;
    @Tag(tag=11) public Integer entityId = null;
    @Tag(tag=14,isFloat=true) public Double totalTickTime = null;
    @Tag(tag=6) public Boolean isIgnoreAuth = null;
}
