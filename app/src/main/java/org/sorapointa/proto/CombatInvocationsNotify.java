package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CombatInvokeEntry.*;
import org.sorapointa.proto.CombatInvokeEntry;

public class CombatInvocationsNotify {
    @Tag(tag=14) public List<CombatInvokeEntry> invokeList = new ArrayList<>();
}
