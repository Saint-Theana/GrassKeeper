package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EvtCostStaminaNotify {
    @Tag(tag=6) public Integer skillId = null;
    @Tag(tag=11,isFloat=true) public Float costStamina = null;
}
