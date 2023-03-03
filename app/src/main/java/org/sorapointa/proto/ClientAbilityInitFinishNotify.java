package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AbilityInvokeEntry.*;
import org.sorapointa.proto.AbilityInvokeEntry;

public class ClientAbilityInitFinishNotify {
    @Tag(tag=14) public List<AbilityInvokeEntry> invokes = new ArrayList<>();
    @Tag(tag=11) public Integer entityId = null;
}
