/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2013, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.eclipse.microprofile.lra.client;

import java.net.URL;

public class LRAStatus {
    private String lraId;
    private String clientId ;
    private boolean isComplete;
    private boolean isCompensated;
    private boolean isRecovering;
    private boolean isActive;
    private boolean isTopLevel;

    public LRAStatus(String lraId) {
        this.lraId = lraId;
    }
    public LRAStatus(URL lraId) {
        this.lraId = lraId.toString();
    }

    public LRAStatus(String lraId, String clientId, boolean isComplete, boolean isCompensated, boolean isRecovering, boolean isActive, boolean isTopLevel) {
        this.lraId = lraId;
        this.clientId = clientId;
        this.isComplete = isComplete;
        this.isCompensated = isCompensated;
        this.isRecovering = isRecovering;
        this.isActive = isActive;
        this.isTopLevel = isTopLevel;
    }

    public String getLraId() {
        return lraId;
    }

    public String getClientId() {
        return clientId;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public boolean isCompensated() {
        return isCompensated;
    }

    public boolean isRecovering() {
        return isRecovering;
    }

    public boolean isActive() {
        return isActive;
    }

    public boolean isTopLevel() {
        return isTopLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LRAStatus)) return false;

        LRAStatus lraStatus = (LRAStatus) o;

        return getLraId().equals(lraStatus.getLraId());
    }

    @Override
    public int hashCode() {
        return getLraId().hashCode();
    }
}
