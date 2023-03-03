package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class VehicleStaminaNotify {
    @Tag(tag=6) public Integer entityId = null;
    @Tag(tag=14,isFloat=true) public Float curStamina = null;
}
