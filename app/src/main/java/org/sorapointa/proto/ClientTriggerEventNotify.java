package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.EventTriggerType.*;
import org.sorapointa.proto.EventTriggerType;

public class ClientTriggerEventNotify {
    @Tag(tag=3) public Integer forceId = null;
    @Tag(tag=2) public Integer eventType = null;
}
